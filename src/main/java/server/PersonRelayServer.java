package server;

import com.linkedin.databus.container.netty.HttpRelay;
import com.linkedin.databus.core.data_model.PhysicalPartition;
import com.linkedin.databus.core.util.InvalidConfigException;
import com.linkedin.databus2.core.DatabusException;
import com.linkedin.databus2.core.seq.MultiServerSequenceNumberHandler;
import com.linkedin.databus2.producers.EventProducer;
import com.linkedin.databus2.relay.DatabusRelayMain;
import com.linkedin.databus2.relay.config.PhysicalSourceStaticConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Map;

/**
 * person relay 表
 * Created by zhiweiwen on 16/3/11.
 */
public class PersonRelayServer extends DatabusRelayMain {
    public static final String MODULE = PersonRelayServer.class.getName();
    public static final Logger LOG = LoggerFactory.getLogger(PersonRelayServer.class);
    static final String FULLY_QUALIFIED_PERSON_EVENT_NAME = "com.linkedin.events.example.person.Person";
    static final int PERSON_SRC_ID = 40;

    MultiServerSequenceNumberHandler _maxScnReaderWriters;
    protected Map<PhysicalPartition, EventProducer> _producers;

    public PersonRelayServer() throws IOException, InvalidConfigException, DatabusException
    {
        this(new HttpRelay.Config(), null);
    }

    public PersonRelayServer(HttpRelay.Config config, PhysicalSourceStaticConfig[] pConfigs)
            throws IOException, InvalidConfigException, DatabusException
    {
        this(config.build(), pConfigs);
    }

    public PersonRelayServer(HttpRelay.StaticConfig config, PhysicalSourceStaticConfig [] pConfigs)
            throws IOException, InvalidConfigException, DatabusException
    {
        super(config, pConfigs);

    }

    public static void main(String[] args) throws Exception
    {
        Cli cli = new Cli();
        cli.setDefaultPhysicalSrcConfigFiles("conf/sources-or-person.json");
        cli.processCommandLineArgs(args);
        cli.parseRelayConfig();
        // Process the startup properties and load configuration
        PhysicalSourceStaticConfig[] pStaticConfigs = cli.getPhysicalSourceStaticConfigs();
        HttpRelay.StaticConfig staticConfig = cli.getRelayConfigBuilder().build();

        // Create and initialize the server instance
        DatabusRelayMain serverContainer = new DatabusRelayMain(staticConfig, pStaticConfigs);

        serverContainer.initProducers();
        serverContainer.registerShutdownHook();
        serverContainer.startAndBlock();
    }

}

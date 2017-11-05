import org.mybatis.generator.api.MyBatisGenerator;


import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.config.Configuration;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public  void generator() throws Exception{
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
       Configuration  config =  cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }
    public static void main(String[] args) {
        try {
            Main  main = new Main();
            main.generator();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

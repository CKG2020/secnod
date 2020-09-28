//import com.baomidou.mybatisplus.enums.FieldFill;
//import com.baomidou.mybatisplus.generator.AutoGenerator;
//import com.baomidou.mybatisplus.generator.InjectionConfig;
//import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
//import com.baomidou.mybatisplus.generator.config.FileOutConfig;
//import com.baomidou.mybatisplus.generator.config.GlobalConfig;
//import com.baomidou.mybatisplus.generator.config.PackageConfig;
//import com.baomidou.mybatisplus.generator.config.StrategyConfig;
//import com.baomidou.mybatisplus.generator.config.TemplateConfig;
//import com.baomidou.mybatisplus.generator.config.converts.MySqlTypeConvert;
//import com.baomidou.mybatisplus.generator.config.po.TableFill;
//import com.baomidou.mybatisplus.generator.config.po.TableInfo;
//import com.baomidou.mybatisplus.generator.config.rules.DbColumnType;
//import com.baomidou.mybatisplus.generator.config.rules.DbType;
//import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
//import java.util.*;
//
//public class Generator {
//    public static void main(String[] args) {
//        // 自定义需要填充的字段
//        List<TableFill> tableFillList = new ArrayList<>();
//        tableFillList.add(new TableFill("ASDD_SS", FieldFill.INSERT_UPDATE));
//
//        // 代码生成器
//        AutoGenerator mpg = new AutoGenerator().setGlobalConfig(
//                // 全局配置
//                new GlobalConfig()
//                        .setOutputDir("D://代码生成器")//输出目录
//                        .setFileOverride(true)// 是否覆盖文件
//                        .setActiveRecord(true)// 开启 activeRecord 模式
//                        .setEnableCache(false)// XML 二级缓存
//                        .setBaseResultMap(true)// XML ResultMap
//                        .setBaseColumnList(true)// XML columList
//                        .setAuthor("youcong")
//                        // 自定义文件命名，注意 %s 会自动填充表实体属性！
//
//                        .setMapperName("%sDao")
//                        .setXmlName("%sDao")
//                        .setServiceName("%sService")
//                        .setServiceImplName("%sServiceImpl")
//                        .setControllerName("%sController")
//        ).setDataSource(
//                // 数据源配置
//                new DataSourceConfig()
//                        .setDbType(DbType.MYSQL)// 数据库类型
//                        .setTypeConvert(new MySqlTypeConvert() {
//                            // 自定义数据库表字段类型转换【可选】
//                            @Override
//                            public DbColumnType processTypeConvert(String fieldType) {
//                                System.out.println("转换类型：" + fieldType);
//                                // if ( fieldType.toLowerCase().contains( "tinyint" ) ) {
//                                //    return DbColumnType.BOOLEAN;
//                                // }
//                                return super.processTypeConvert(fieldType);
//                            }
//                        })
//                        .setDriverName("com.mysql.jdbc.Driver")
//                        .setUsername("root")
//                        .setPassword("root")
//                        .setUrl("jdbc:mysql://192.168.56.101:3306/blog?characterEncoding=utf8")
//        ).setStrategy(
//                // 策略配置
//                new StrategyConfig()
//                        // .setCapitalMode(true)// 全局大写命名
//                        // .setDbColumnUnderline(true)//全局下划线命名
//                        .setTablePrefix(new String[]{"wp_"})// 此处可以修改为您的表前缀
//                        .setNaming(NamingStrategy.underline_to_camel)// 表名生成策略
////                        .setInclude("wechat_reply") //指定生成表，注释掉或不写，默认生成所有
//                        // .setExclude(new String[]{"test"}) // 排除生成的表
//                        // 自定义实体父类
//                        // .setSuperEntityClass("com.baomidou.demo.TestEntity")
//                        // 自定义实体，公共字段
//
//                        // .setSuperEntityColumns(new String[]{"id"})
//                        .setTableFillList(tableFillList)
//        ).setPackageInfo(
//                // 包配置
//                new PackageConfig()
//                        .setParent("com.springcloud.blog")// 自定义包路径
//                        .setController("controller")// 这里是控制器包名，默认 web
//                        .setMapper("dao")
//                        .setEntity("entity")
//                        .setService("service")
//                        .setServiceImpl("service.impl")
//        ).setCfg(
//                // 注入自定义配置，可以在 VM 中使用 cfg.abc 设置的值
//                new InjectionConfig() {
//                    @Override
//                    public void initMap() {
//                        Map<String, Object> map = new HashMap<>();
//                        map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "");
//                        this.setMap(map);
//                    }
//                }.setFileOutConfigList(Collections.<FileOutConfig>singletonList(new FileOutConfig("/templates/mapper.xml.vm") {
//                    // 自定义输出文件目录
//                    @Override
//                    public String outputFile(TableInfo tableInfo) {
//                        return "D://代码生成器//" + tableInfo.getEntityName() + "Dao.xml";
//                    }
//                }))
//        ).setTemplate(
//                // 关闭默认 xml 生成，调整生成 至 根目录
//                new TemplateConfig().setXml(null)
//
//        );
//
//        // 执行生成
//        mpg.execute();
//
//        // 打印注入设置，这里演示模板里面怎么获取注入内容【可无】
//        System.err.println(mpg.getCfg().getMap().get("abc"));
//
//    }
//}

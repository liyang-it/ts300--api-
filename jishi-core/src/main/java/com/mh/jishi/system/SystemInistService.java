//package com.mh.jishi.system;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.env.Environment;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.Resource;
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//
///**
// * 系统启动服务，用于设置系统配置信息、检查系统状态及打印系统信息
// */
//@Component
//class SystemInistService {
//    private SystemInistService systemInistService;
//
//
//    @Autowired
//    private Environment environment;
//
//    @PostConstruct
//    private void inist() {
//
//        systemInistService = this;
//        initConfigs();
//        /*
//        SystemInfoPrinter.printInfo("Litemall 初始化信息", getSystemInfo());
//         */
//    }
//
//    /**
//     * 系统默认配置
//     */
//    private final static Map<String, String> DEFAULT_CONFIGS = new HashMap<>();
//    /**
//     * 系统默认配置描述
//     */
//    private final static Map<String, String> DEFAULT_DESC = new HashMap<>();
//
//    static {
//    }
////
////    @Autowired
////    private LitemallSystemConfigService litemallSystemConfigService;
//
//
////    private void initConfigs() {
////        // 1. 读取数据库全部配置信息
////        Map<String, String> configs = litemallSystemConfigService.queryAll();
////
////        // 2. 分析DEFAULT_CONFIGS, 如果数据库不存在配置则新增
////        for (Map.Entry<String, String> entry : DEFAULT_CONFIGS.entrySet()) {
////            if (configs.containsKey(entry.getKey())) {
////                continue;
////            }
////
////            configs.put(entry.getKey(), entry.getValue());
////            litemallSystemConfigService.addConfig(entry.getKey(), entry.getValue(), DEFAULT_DESC.get(entry.getKey()));
////        }
////
////        SystemConfig.setConfigs(configs);
////    }
//}

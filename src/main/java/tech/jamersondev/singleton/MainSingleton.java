package tech.jamersondev.singleton;

import tech.jamersondev.singleton.service.QueryService;

public class MainSingleton {
    public static void main(String[] args) {
        QueryService.Query1();
        QueryService.Query2();
        QueryService.Query3();
    }
}

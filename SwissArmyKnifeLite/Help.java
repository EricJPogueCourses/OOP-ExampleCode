class Help {
    public static void printHelp() {
        // Todo: Implement full help system. 
        System.out.println("\nHttpRequest [URL] examples:");
        System.out.println("java sakl -HttpRequest https://thunderbird-data.azurewebsites.net/");
        System.out.println("java sakl -HttpRequest https://thunderbird-data.azurewebsites.net/ldw6txsjg5.json");
        System.out.println("\nHttpRequestIndex [URL] example:");
        System.out.println("java sakl -HttpRequestIndex https://thunderbird-data.azurewebsites.net/url-list.json");
    }
}
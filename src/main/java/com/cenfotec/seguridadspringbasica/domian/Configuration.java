package com.cenfotec.seguridadspringbasica.domian;

public class Configuration {
    private String server;
    private String kafkaCluster;
    private boolean vpnEnabled;

    public Configuration() {
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getKafkaCluster() {
        return kafkaCluster;
    }

    public void setKafkaCluster(String kafkaCluster) {
        this.kafkaCluster = kafkaCluster;
    }

    public boolean isVpnEnabled() {
        return vpnEnabled;
    }

    public void setVpnEnabled(boolean vpnEnabled) {
        this.vpnEnabled = vpnEnabled;
    }
}

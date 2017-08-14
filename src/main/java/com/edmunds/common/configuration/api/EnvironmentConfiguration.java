package com.edmunds.common.configuration.api;

public class EnvironmentConfiguration {

    /**
     * The host name of the zookeeper cluster used for ETM.
     */
    private String zooKeeperHostName;

    /**
     * The name of the environment.
     * <p/>
     * Typical values: di, ti, pi, dev-epe3, proda, prodb
     */
    private String environmentName;

    /**
     * The data center that this application/process is running in.
     * <p/>
     * Typical values: smdc, lax1, ord
     */
    private String dataCenter;

    /**
     * The Edmunds property.
     * <p/>
     * Typical Values: insideline, edmunds, internal
     */
    private String site;

    /**
     * Url prefix used when building URL's for customer facing web applications.
     * <p/>
     * Typical values: DEV-EPE3
     */
    private String urlPrefix;

    /**
     * True if this client should be added to the ETM pool.
     */
    private boolean etmClientEnabled;

    /**
     * Constructor initializes with default values for unit testing.
     */
    public EnvironmentConfiguration() {
        this.zooKeeperHostName = "localhost";
        this.etmClientEnabled = true;
        this.environmentName = "development";
        this.dataCenter = "development";
        this.site = "development";
        this.urlPrefix = "";
    }

    /**
     * The hostname of the zookeeper cluster.
     *
     * @return the hostname.
     */
    public String getZooKeeperHostName() {
        return zooKeeperHostName;
    }

    public void setZooKeeperHostName(String zooKeeperHostName) {
        this.zooKeeperHostName = zooKeeperHostName;
    }

    /**
     * The name of the environment.
     * <p/>
     * Typical values: di, ti, pi, dev-epe3, prod
     *
     * @return the name of the environment (default: development).
     */
    public String getEnvironmentName() {
        return environmentName;
    }

    /**
     * Sets the environment name.
     *
     * @param environmentName the environment name.
     */
    public void setEnvironmentName(String environmentName) {
        this.environmentName = (environmentName == null) ? null : environmentName.toLowerCase();
    }

    /**
     * The data center that this application/process is running in.
     * <p/>
     * Typical values: smdc, lax1, ord
     *
     * @return the name of the data center (default: development).
     */
    public String getDataCenter() {
        return dataCenter;
    }

    public void setDataCenter(String dataCenter) {
        this.dataCenter = (dataCenter == null) ? null : dataCenter.toLowerCase();
    }

    /**
     * The Edmunds property.
     * <p/>
     * Typical Values: insideline, edmunds, internal
     *
     * @return the Edmunds property  (default: development).
     */
    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = (site == null) ? null : site.toLowerCase();
    }

    /**
     * Url prefix used when building URL's for customer facing web applications.
     * <p/>
     * Typical values: DEV-EPE3
     *
     * @return the URL prefix (default: "").
     */
    public String getUrlPrefix() {
        return urlPrefix;
    }

    public void setUrlPrefix(String urlPrefix) {
        this.urlPrefix = (urlPrefix == null) ? null : urlPrefix.toLowerCase();
    }

    /**
     * Returns true if the client should be added to the ETM pool.
     *
     * @return true if this current client should be added to ETM.
     */
    public boolean isEtmClientEnabled() {
        return this.etmClientEnabled;
    }

    public void setEtmClientEnabled(boolean etmClientEnabled) {
        this.etmClientEnabled = etmClientEnabled;
    }
}

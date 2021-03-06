package com.v5analytics.simpleorm.model;

import com.v5analytics.simpleorm.Entity;
import com.v5analytics.simpleorm.Field;
import com.v5analytics.simpleorm.Id;

import java.util.HashMap;
import java.util.Map;

@Entity(tableName = "jettySession")
public class JettySession {
    @Id
    private String id;

    @Field
    private long created;

    @Field
    private long accessed;

    @Field
    private String clusterId;

    @Field
    private Long version;

    @Field
    private Map<String, Object> data = new HashMap<>();

    // Used by SimpleOrm to create instance
    @SuppressWarnings("UnusedDeclaration")
    protected JettySession() {

    }

    public JettySession(String clusterId, long created) {
        this.clusterId = this.id = clusterId;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public long getCreated() {
        return created;
    }

    public long getAccessed() {
        return accessed;
    }

    public String getClusterId() {
        return clusterId;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public void setAccessed(long accessed) {
        this.accessed = accessed;
    }
}

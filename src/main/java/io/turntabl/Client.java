package io.turntabl;

public abstract class Client {
    private String name;
    private String id;
    private ServiceLevel serviceLevel;

    public Client(String name, String id, ServiceLevel serviceLevel) {
        this.name = name;
        this.id = id;
        this.serviceLevel = serviceLevel;
    }

    public abstract String getClientContactName();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ServiceLevel getServiceLevel() {
        return serviceLevel;
    }

    public void setServiceLevel(ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", serviceLevel=" + serviceLevel +
                '}';
    }
}

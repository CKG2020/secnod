package builder;

import java.util.*;

public class Order {
    private String code;
    private List<String> offers;
    private Map<String, Object> features;
    public void addOffer(String offer) {
        offers = Optional.ofNullable(offers)
                .orElseGet(ArrayList::new);
        offers.add(offer);
    }
    public <T> void addFeature(String key, T value) {
        features = Optional.ofNullable(features)
                .orElseGet(HashMap::new);
        features.put(key, value);
    }

    //省略getter setter


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<String> getOffers() {
        return offers;
    }

    public void setOffers(List<String> offers) {
        this.offers = offers;
    }

    public Map<String, Object> getFeatures() {
        return features;
    }

    public void setFeatures(Map<String, Object> features) {
        this.features = features;
    }

    public static void main(String[] args) {
        Order order = GenericBuilder.of(Order::new)
                .with(Order::setCode, "123232")
                .with(Order::addOffer, "满100减5")
                .with(Order::addFeature, "category", "shoe")
                .build();
    }
}

package org.stuckboy.models.ship;

public class ShipFuel {

    public static class ConsumedFuel {
        private Integer amount;
        private String timestamp;

        public Integer getAmount() {
            return amount;
        }

        public void setAmount(Integer amount) {
            this.amount = amount;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

    private Integer current;
    private Integer capacity;
    private ConsumedFuel consumed;

    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public ConsumedFuel getConsumed() {
        return consumed;
    }

    public void setConsumed(ConsumedFuel consumed) {
        this.consumed = consumed;
    }
}

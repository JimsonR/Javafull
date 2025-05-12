package Builder;//Builder Pattern
// Allows the construction of complex objects step by step.
// The final object is often immutable.

public class Car{
    private String engine;
    private String seats;
    private String airbags;

    public static class Builder {

        private String engine;
        private String seats;
        private String airbags;

        public Builder setEngine(String engine){
            this.engine = engine; return this;
        }
        public Builder setSeats(String seats){
            this.seats = seats;
            return this;
        }
        public Builder setAirbags(String airbags){
            this.airbags = airbags;
            return this;
        }

        public Car build(){
            return new Car(this);
        }



}
private Car(Builder builder){
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.airbags = builder.airbags;
}
}

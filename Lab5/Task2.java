class Car{      
        static int car_issue_no=0;
        private String name;
        private String model;
        private String engine_name;

        { car_issue_no++; }
        public String getName(){
                return name;
        }
        public String getModel(){
                return model;
        }
        public String getEngine(){
                return engine_name;
        }
        public void setName(String n){
                this.name =n;
        }
        public void setModel(String model){
                this.model =model;
        }
        public void setEngine(String engine){
                this.engine_name =engine;
        }
}
public class Task2 {
        public static void main(String[] args) {
                Car Corolla = new Car();
                Corolla.setName("Corrolla Gli");
                Corolla.setModel("2021");
                Corolla.setEngine("V6 1.3");
                System.out.println("Name = " + Corolla.getName());
                System.out.println("Model = " + Corolla.getModel());
                System.out.println("Engine = " + Corolla.getEngine());

                Car gtr = new Car();
                gtr.setName("Mercedes GTR");
                gtr.setModel("2019");
                gtr.setEngine("V12 Turbo hybrid");
                System.out.println("Name = " + gtr.getName());
                System.out.println("Model = " + gtr.getModel());
                System.out.println("Engine = " + gtr.getEngine());
        }
}

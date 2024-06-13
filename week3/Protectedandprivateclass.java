public class Protectedandprivateclass {
    protected class Protectedinnerclass{
        public void display(){
            System.out.println("Inside Protectedinnerclass");
        }
        private class Nestedrivateinnerclass{
            public void display(){
                System.out.println("Inside Nestedrivateinnerclass");
            }
        }
    }
    //Nested private class
    private class Privateinnerclass{
        public void display(){
            System.out.println("Inside Privateinnerclass");
        }
        protected class Nestedprotectedinnerclass{
            public void display(){
                System.out.println("Inside Nestedprotectedinnerclass");
            }
        }
    }
    public void accessInnerClasses(){
        Protectedinnerclass protectedinner = new Protectedinnerclass();
        protectedinner.display();
        Privateinnerclass privateinnerclass = new Privateinnerclass();
        privateinnerclass.display();

    }
}


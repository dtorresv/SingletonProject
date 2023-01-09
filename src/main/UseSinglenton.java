package main;

public class UseSinglenton {
        private final Singleton singlentonInstance = Singleton.getInstance();

        public Singleton getSinglentonInstance(){
            return this.singlentonInstance;
        }
}

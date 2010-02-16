class E004_ParameterMethodDeclarations {
    void oneParameter(int one) {
    }
    
    void twoParameters(int one, String two) {
    }
    
    void simpleGenericParameter(int one, String two, java.util.List<String> three) {
    }
    
    public void publicMethod(int one, String two, java.util.List<String> three, boolean isPublic) {
    }
    
    void E004_ParameterConstructorDeclarations(java.util.List<? extends Number> list) {
    }
    
    void E004_ParameterConstructorDeclarations(Class<? super Number> clazz) {
    }
    
    void array(int[] one) {
    }
    
    void twoDimensionalArray(int[] one[]) {
    }
    
    void varArgsOneParameter(String... two) {
    }
    
    void varArgsMoreParameters(int one, String... two) {
    }
    
    void varArgsArray(int one, String[]... two) {
    }
}
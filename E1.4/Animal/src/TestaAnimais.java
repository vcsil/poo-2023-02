class TestaAnimais {

    public void testaSom() {
        Animal[] animais = new Animal[3];
        animais[0] = new Sapo();
        animais[1] = new Cachorro();
        animais[2] = new Boi();

        for (int i = 0; i < animais.length; i++){
            System.out.println(animais[i].som());
        };
    };
    
}

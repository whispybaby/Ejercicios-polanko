public class Main {
    public static void main(String[] args) throws Exception {
        Profesion estudiante = new Profesion("estudiante", "555");
        Profesion gg = new Profesion("gg", "177");
        Gerente uwu = new Gerente("Oscar","204732341","Los mazanares","sisoy@gmail.com","234234","12424646",estudiante);
        System.out.println(uwu.infoGerente());
        Gerente owo = new Gerente("Carlos","204732341","Los mazanares","sisoy@gmail.com","234234","12424646",gg);
        System.out.println(owo.infoGerente());

        Licencia pou = new Licencia("activa", 12313);
        Conductor casa = new Conductor("a1","a2","a3",1231,pou);
        System.out.println(casa.infoConductor());
        System.out.println("hola mundo xd");
        System.out.println("sysout");
    }
}

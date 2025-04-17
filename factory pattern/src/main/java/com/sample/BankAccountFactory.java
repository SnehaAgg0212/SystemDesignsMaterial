package com.sample;

public class BankAccountFactory{
    private static final Map<String, Class<? extends BankAccount>> registeredAccounts = new HashMap<>();
    static{
        Reflections reflection = new Reflections("com.sample");
        Set<Class<? extends BankAccount>> bankaccounts = reflections.getSubTypesOf(BankAccount.class);
        for(Class<? extends BankAccount> clazz : bankaccounts){
            if(clazz.isAnnotationPresent(BankAccountType.class)){
                registerAccount.add(clazz.getAnnotaion(BankAccountType.class).value(), clazz);
            }
        }
    }

    public static BankAccount createAccount(String type){
        Class<? extends BankAccount> clazz = registerAccount.get(type.toLowerCase);
        if(clazz.nonNull()){
            try{
                return clazz.getDeclaredContructor().newInstance();
            }catch(Exception e){
                System.out.println(e.getMsg());
            }
        }
    }
}
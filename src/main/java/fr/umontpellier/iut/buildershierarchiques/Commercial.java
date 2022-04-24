package fr.umontpellier.iut.buildershierarchiques;

public abstract class Commercial extends Employe {
    private double chiffreAffaires;
    private double tauxCommission;

    public Commercial(AbstractCommercialBuilder<?> CommercialBuilder){
        super(CommercialBuilder);
        this.chiffreAffaires=CommercialBuilder.chiffreAffaires;
        this.tauxCommission=CommercialBuilder.tauxCommission;
    }



    public abstract static class AbstractCommercialBuilder<T extends Employe.AbstractEmployeBuilder<T>> extends Employe.AbstractEmployeBuilder<T> {
        private double chiffreAffaires;
        private double tauxCommission;

        protected abstract T self();

        public abstract Commercial build();

        public T setNom(double chiffreAffaires) {
            this.chiffreAffaires = chiffreAffaires;
            return self();
        }

        public T setBase(double tauxCommission) {
            this.tauxCommission = tauxCommission;
            return self();
        }
    }


    public void negocierTransaction() {
        System.out.println("Je negocie une transaction avec " + tauxCommission + " " + chiffreAffaires);
    }

    @Override
    public String toString() {
        return "Commercial{" + super.toString() +
                ", chiffreAffaires=" + chiffreAffaires +
                ", tauxCommission=" + tauxCommission +
                '}';
    }
}

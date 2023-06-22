package cozinha;

public abstract class Pizza {
    protected Ingrediente ingrediente;

    public Pizza(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public abstract void criar();
}

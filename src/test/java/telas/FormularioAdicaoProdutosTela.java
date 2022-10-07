package telas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FormularioAdicaoProdutosTela extends BaseTela{

    public FormularioAdicaoProdutosTela(WebDriver app) {
        super(app);
    }

    public FormularioAdicaoProdutosTela preencherNomeProduto(String nomeProduto){

        app.findElement(By.id("com.lojinha:id/productName")).click();
        app.findElement(By.id("com.lojinha:id/productName")).findElement(By.id("com.lojinha:id/editText")).sendKeys(nomeProduto);

        return this;
    }

    public FormularioAdicaoProdutosTela preencherValorProduto(String valorProduto){

        app.findElement(By.id("com.lojinha:id/productValue")).click();
        app.findElement(By.id("com.lojinha:id/productValue")).findElement(By.id("com.lojinha:id/editText")).sendKeys(valorProduto);

        return this;
    }

    public FormularioAdicaoProdutosTela preencherCoresProdutos(String coresProduto){

        app.findElement(By.id("com.lojinha:id/productColors")).click();
        app.findElement(By.id("com.lojinha:id/productColors")).findElement(By.id("com.lojinha:id/editText")).sendKeys(coresProduto);

        return this;
    }

    public FormularioAdicaoProdutosTela submissaoComErro(){

        app.findElement(By.id("com.lojinha:id/saveButton")).click();

        return this;
    }

    public String obterMessagemDeErro(){

        return capturarToast();
    }
}

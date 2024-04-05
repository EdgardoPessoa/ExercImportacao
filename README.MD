**Gerenciador de Produtos em Java**

Este é um simples gerenciador de produtos desenvolvido em Java. Ele permite adicionar, visualizar e calcular preços totais de produtos comuns, importados e usados.

### Como usar

1. Clone o repositório para sua máquina local:

```
git clone https://github.com/seu-usuario/gerenciador-de-produtos-java.git
```

2. Compile o programa:

```
cd gerenciador-de-produtos-java
javac Source/Main/Program.java
```

3. Execute o programa:

```
java Source.Main.Program
```

4. Siga as instruções fornecidas pelo programa para adicionar produtos e calcular preços totais.

### Exemplo de uso

Suponha que você queira adicionar três produtos: um comum, um importado e um usado.

```
Entre o número de produtos: 3
Produto #1:
Comum, usado ou importado (C/U/I)? C
Nome: Camiseta
Preço: 29.90
Produto #2:
Comum, usado ou importado (C/U/I)? I
Nome: Smartphone
Preço: 999.99
Taxa: 50.00
Produto #3:
Comum, usado ou importado (C/U/I)? U
Nome: Livro
Preço: 39.90
Fabricado em (DD/MM/AAAA): 15/03/2022
```

Após inserir os produtos, o programa exibirá as etiquetas de preço para cada um:

```
Etiquetas de preço:
Produto: Camiseta, R$ 29.90
Produto: Smartphone, Preço: R$ 1049.99 (Taxa: R$ 50.00).
Produto: Livro (usado), Preço: R$ 39.90 (Fabricado em: 15/03/2022).
```

### Contribuindo

Sinta-se à vontade para contribuir para este projeto abrindo problemas ou enviando solicitações de pull requests.

Se você tiver alguma sugestão ou encontrar algum problema, por favor, abra uma issue aqui no GitHub.
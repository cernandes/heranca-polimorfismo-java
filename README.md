# Herança e polimorfismo

### Objetivo
Exercício prático de POO para desenvolver os conceitos de herança com as classes ```UsedProduct``` e ```ImportedProduct``` extendendo a classe ```Product``` e polimorfismo com método ```priceTag()``` assumindo diferentes comportamentos de acordo com a classe.

### Exercício proposto
Fazer um programa para ler os dados de N produtos (N fornecido pelo usuário). Ao final, mostrar a etiqueta de preço de cada Produto na mesma ordem em que foram digitados.
Todo produto possui nome e preço. Produtos importados possuem uma taxa de alfândega, e produtos usados possuem data de fabricação.
Estes dados específicos devem ser acrescentados na etiqueta de preço conforme exemplo de saída de dados. 
Para produtos importados, a taxa e alfândega deve ser acrescentada ao preço final do produto.
implementar o programa conforme o diagrama de classes.

### Diagrama de classes
<p align="center">
  <img src="https://raw.githubusercontent.com/cernandes/heranca-polimorfismo-java/master/assets/img/class-diagram.jpg" width="350" title="hover text" alt="accessibility text">
</p>

### Entrada de dados

Enter the number of products: <span style="color: red">3</span>

Product #<span style="color: blue">1</span> data:
Common, used or imported (c/u/i)? <span style="color: red">i</span>
Name: <span style="color: red">Tablet</span>
Price: <span style="color: red">260.00</span>
Customs fee: <span style="color: red">20</span>

Product #<span style="color: blue">2</span> data:
Common, used or imported (c/u/i)? <span style="color: red">c</span>
Name: <span style="color: red">Notebook</span>
Price: <span style="color: red">1100.00</span>

Product #<span style="color: blue">3</span> data:
Common, used or imported (c/u/i)? <span style="color: red">u</span>
Name: <span style="color: red">Iphone</span>
Price: <span style="color: red">400.00</span>
Manufacture date (DD/MM/YYYY): <span style="color: red">15/03/2017</span>

### Saída de dados
PRICE TAGS:
<p>Tablet $ 280.00 (Customs fee: $ 20.00)</p>
<p>Notebook $ 1100.00</p>
<p>Iphone (used) $ 400.00 (Manufacture date: 15/03/2017)</p>

### Referência
Projeto inspirado em aulas do curso de POO com java da [Udemy](https://www.udemy.com/course/java-curso-completo) 

### Autor 
@[Claudio Ernandes](https://github.com/cernandes)

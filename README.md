# FIAP - Programação Orientada a Objetos

## 📌 Descrição do Projeto

Este projeto foi desenvolvido como atividade prática da disciplina de **Programação Orientada a Objetos (POO)** da FIAP.

O objetivo foi criar uma classe que represente um objeto do mundo real e testar sua utilização através de instâncias criadas na classe principal.

Neste projeto foi criada a classe **Tv**, simulando o funcionamento básico de uma televisão.

---

## 🧠 Classe Desenvolvida

### Classe: `Tv`

A classe `Tv` representa uma televisão do mundo real, contendo características físicas e comportamentos básicos de uso.

Ela foi criada no pacote:


br.com.fiapride.model


---

## 🎯 O que o objeto representa no mundo real

Cada objeto criado da classe `Tv` representa uma televisão real, com suas próprias configurações.

Por exemplo:
- Uma TV pode estar ligada ou desligada
- Pode ser smart ou não
- Possui tamanho específico
- Pode mudar de canal

Ou seja, cada instância representa uma TV diferente.

No sistema principal foram criadas duas TVs diferentes (`tv1` e `tv2`) para demonstrar o conceito de objetos independentes.

---

## ⚙️ Atributos da Classe

A classe possui os seguintes atributos:

```java
public int polegadas;
public boolean smart;
public double tamanho;
public boolean ligada;
public int canalAtual;
Significado de cada atributo:

polegadas → tamanho da TV em polegadas

smart → indica se a TV é smart ou não

tamanho → tamanho em centímetros

ligada → estado da TV (ligada ou desligada)

canalAtual → canal em que a TV está

🛠️ Métodos Criados
1. Construtor da classe
public Tv(int polegadas, boolean smart, double tamanho, boolean ligada, int canalAtual)

O construtor é responsável por inicializar os valores da TV no momento da criação do objeto.

Exemplo:

Tv tv1 = new Tv(95, true, 100, false, 5);
2. Método ligarTv()
public void ligarTv(boolean ligada)

Esse método altera o estado da TV (ligada ou desligada).

Ele também evita ligar uma TV que já está ligada, exibindo uma mensagem no console.

✔ Simula o comportamento real de ligar uma televisão.

3. Método mudarCanal()
public void mudarCanal(int canalAtual)

Esse método permite alterar o canal atual da TV.

Regras implementadas:

Não permite canais menores que 1

Exibe erro caso canal inválido

✔ Simula a troca de canais de uma TV real.

🚀 Classe Principal

A execução acontece na classe:

br.com.fiapride.main.SistemaPrincipal

Nela foram criadas duas instâncias:

Tv tv1 = new Tv(95,true,100,false,5);
Tv tv2 = new Tv(95,true,100,true,5);

Isso demonstra que cada objeto possui seu próprio estado.

🧪 Exemplo de Execução

Durante a execução:

Mostra os dados das TVs

Liga as TVs

Mostra canal atual

Troca o canal

Exemplo de saída no console:

--- Sistema TV 1 ---
Polegadas: 95
Tv smart: true
A tv está ligada: false
TV Ligada!
Canal Atual: 5
Novo Canal: 7
📚 Conceitos de POO Aplicados

Neste projeto foram utilizados:

✔ Classes e objetos
✔ Construtor
✔ Instanciação com new
✔ Métodos com regras de negócio
✔ Simulação de objeto do mundo real

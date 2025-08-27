Lista 1 - POO
Prof. Dr. Alexandre Garcia de Oliveira
March 14, 2025
1 Introdu¸c˜ao, construtores e enumera¸c˜oes
Exerc´ıcio 1. Dada a classe Pessoa que possui os atributos: String nome,
String sexo, int idade, boolean vegetariana. Fa¸ca agora uma classe Churrasco que possua: Atributos: qtdCarne(double); M´etodo: verificarConsumo():
Recebe via parˆametro uma Pessoa e com isto define a consuma¸c˜ao m´edia de
carne (quantidade de carne consumida) pessoas de 0 a 3 anos n˜ao consomem,
vegetarianos tamb´em n˜ao. Pessoas de 4 a 12 anos consomem 1 kilo de carne e
de 13 anos em diante 2 kilos de carne.
Exerc´ıcio 2. Implemente uma classe Lˆampada com os seguintes componentes
e fa¸ca um teste ao final: Atributos: estado(Enum) M´etodos:
• click(): ao chamar este m´etodo a lˆampada ´e colocada no estado ”apagada” caso esteja ”acesa” e ´e colocado no estado ”acesa” caso esteja ”apagada”.
• qtdAcendimentos(): retorna quantas vezes a lˆampada foi acesa (DICA:
este m´etodo deve ser chamada no m´etodo acima).
• checaEstado(): retorna o estado atual da Lˆampada.
Exerc´ıcio 3. Implemente uma classe chamada Complexo para representar
n´umeros imagin´arios e esta deve possuir:
• Atributos: dois doubles a (Parte real) e b (Parte imagin´aria).
• M´etodos:
1. Construtor;
2. soma(): recebe via parˆametro outro n´umero complexo (objeto desta
classe) e efetua sua soma, ou seja, parte real ser´a somada com parte
real e parte imagin´aria com parte imagin´aria.
3. multiplica(): recebe via parˆametro outro complexo (objeto desta
classe) e efetue a f´ormula (a + bi) · (c + di) = (ac − bd) + (ad + bc)i
4. toString(): Mostra uma string na tela com os atributos a e b na
nota¸c˜ao Complexa a + bi;
1
5. modulo(): retorna o m´odulo do n´umero complexo que ´e dado por
√
a
2 + b
2
6. argumentoPrincipal(): retorna o ˆangulo formado pelo n´umero complexo no plano de Argand-Gauss, que ´e dado pela f´ormula θ =
tan−1

b
a

Exerc´ıcio 4. Implemente a classe Cliente que possua os atributos nome,
saldo, e limite. Esta deve possuir tamb´em os m´etodos sacar(), depositar(),
checarSaldo(), e obterNome(). Sabe-se que s´o ´e poss´ıvel sacar se o saldo+limite
forem superiores `a quantia. Os m´etodos sacar() e depositar() necessitam de
parˆametros. O m´etodo checarSaldo deve retornar o valor saldo+limite. O
m´etodo obterNome() deve retornar o nome do Cliente.
Exerc´ıcio 5. Implemente uma classe que modele um triˆangulo equil´atero
(lados iguais). Atributos: lado, per´ımetro, ´area. M´etodos: calcArea(), calcPer´ımetro e seus gets. O lado dever´a ser o ´unico atributo inicializado via
construtor. F´ormulas: Area = ´ lado×
√
3
2
, Per´ımetro = 3 × lado.
Exerc´ıcio 6. Implemente uma classe que modele um jogo de adivinha¸c˜ao de
n´umeros de 0 a 99. Atributos: um n´umero inteiro sorteado. M´etodos: sortear(),
advinhar(). OBS: O objeto para gerar n´umero aleat´orios no Java ´e o Random;
vocˆe deve instanci´a-lo e chamar seu m´etodo nextInt() que deve possuir um
argumento inteiro, no caso aqui, 100.
Exerc´ıcio 7. Implemente a classe Eq2Grau que possua: Atributos: a, b e
c (doubles); M´etodos: delta(): retorna o delta da equa¸c˜ao; raiz1(): retorna a
primeira raiz se ∆ ≥ 0, se n˜ao, retorna NaN; raiz2(): retorna a segunda raiz se
∆ ≥ 0, se n˜ao, retorna NaN.
2 Modificador static
Exerc´ıcio 8. Implemente a classe Porta que possua: Atributos: isOpen(boolean),
numAberturas(int); M´etodos: abrir(): abre a porta e conta 1 na contagem de
aberturas; fechar(): fecha a porta. OBS: O atributo numAberturas deve contar
o total de aberturas de todas as portas poss´ıveis.
3 Rela¸c˜ao entre classes
Exerc´ıcio 9. Usando o Exerc´ıcio 4, implemente a classe Transferencia que
possu´ı o m´etodo transferir() que recebe via parˆametro dois Clientes c1 e c2
(ver exerc´ıcio acima) e a quantia (necessita uma verifica¸c˜ao de saldo). Deve ser
tirado da conta de c2 e colocado na conta de c1. Exiba tamb´em uma mensagem
de conclus˜ao de transferˆencia explicitando os nomes dos envolvidos.
Exerc´ıcio 10. Usando o exerc´ıcio 8, fa¸ca uma classe Casa com que represente
uma casa. A casa tem uma cor, uma porta de entrada e pode ter at´e trˆes portas

(considere que todas as portas podem ser abertas ou fechadas independentemente). Implemente os m´etodos para abrir e fechar as portas, e um m´etodo que
retorne quantas portas est˜ao abertas.
Exerc´ıcio 11. Usando o exerc´ıcio anterior, implemente a classe Edificio que
possui v´arios apartamentos. Suponhamos, por simplicidade, que cada edif´ıcio
possui apenas 3 apartamentos. Crie uma classe Apartamento que possui um
n´umero identificador. A classe Edificio deve ser capaz de adicionar apartamentos, listar todos os apartamentos e buscar um apartamento pelo seu identificador.
Exerc´ıcio 12. Implemente a classe Cliente que contenha os atributos: nome,
cpf (Strings) e telefone (Telefone). E que contenha os m´etodos: mostrarDados()
e adicionarTelefone() o primeiro deve mostrar todos os dados do cliente incluindo
o telefone e o ´ultimo deve associar um novo telefone ao cliente. Implemente a
classe Telefone que possua os atributos: ddd e n´umero (Strings) e os m´etodos:
obterNumero() e obterDDD().
3

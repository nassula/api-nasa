# api-nasa

<h1> Imersão Java Alura</h1>

<p> Sejam bem-vindos ao meu projeto desenvolvido para a Imersão Java da Alura</p>

<h2>🛑 Pré-Requisitos</h2>

<p>
✅ Conhecer a sintaxe da Java<br>
✅ Java JDK 8<br>
✅ IDE para desenvolvimento Java Eclipse Spring Tool<br>
✅ Git<br>
✅ Conta no GitHub<br>
</p>


<h2> 👣 Passo-a-Passo</h2>

<p>
<strong>	1.</strong> Criar um programa em Java que acesse uma API do IMDB e gere Stickers para WhatsApp com base em imagens que essa API retorna <br>
<strong>	2.</strong> Criar uma API de Linguagens de Programação e subir ela online, deixando disponível para outros acessarem <br>
</p>

----

<h2> 📚 Customizações </h2>

<p>
Ao invés de criar uma API de Linguagens de programação, eu criei uma API que guarda imagens, na minha API você vai encontrar várias imagens que eu baixei do site da Nasa.
Minha API retorna os seguintes dados: autor, descrição, URL da imagem e titulo da mesma

Junto com o código da minha API você vai encontrar uma adaptação do programa gerador de stickers. Nessa adaptação, ao invés de gerar imagens o programa preenche a base de dados da minha API online com os dados que eu preciso.
Como é feito isso? Simples, o programa acessa a API da Nasa, extrai as informaçõe que eu preciso para minha API e faz várias requisições POST a minha API online, preenchendo assim a sua base de dados.

O código original que foi criado nas aulas da imersão você encontra nesse [repositório](https://github.com/nassula/alura-imersao-java/ "repositório").
</p>

<p>
Você pode testar minha API da Nasa utilizando essas URLs:

https://api.diegonassula.com/api-nasa/pictures
  
----------------------------------------------------
<strong>Metódo HTTP: GET</strong>

URL: https://api.diegonassula.com/api-nasa/pictures

Lista todas as imagens da base


----------------------------------------------------
<strong>Metódo HTTP: POST</strong>

URL: https://api.diegonassula.com/api-nasa/pictures

Adiciona uma nova entrada na base, seguindo o JSON abaixo:

{
  "autor": "nomeautor",
  "description": "descriçãodaimagens",
  "hdUrl": "urldaimagem",
  "title": "titulo da imagem"
}


----------------------------------------------------
<strong>Metódo HTTP: PUT</strong>

URL: https://api.diegonassula.com/api-nasa/pictures

Altera uma entrada da base, seguindo o JSON abaixo:

{
  "id": "id",
  "autor": "nomeautor",
  "description": "descriçãodaimagens",
  "hdUrl": "urldaimagem",
  "title": "titulo da imagem"
}

----------------------------------------------------
<strong>Metódo HTTP: DELETE</strong>

URL: https://api.diegonassula.com/api-nasa/pictures/id

Apaga uma entrada da base de dados utilizando o ID


</p>

Qualquer dúvida sobre minha implementação, entre em contato!


<h2> 🤝 Contribuindo </h2>

<p>
Este repositório foi criado para fins de estudo, então contribua com ele.<br>
Se te ajudei de alguma forma, ficarei feliz em saber. E caso você conheça alguém que se identidique com o conteúdo, não deixe de compatilhar.<br>
<br>
Se possível:<br>
⭐️  Star o projeto<br>
🐛 Encontrar e relatar issues<br>
</p>


------------

Disponibilizado por [Diego Nassula](https://www.linkedin.com/in/diegonassula/ "Diego Nassula").

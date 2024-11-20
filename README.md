Exercício da disciplina Programação Orientada a Objetos, cujo enunciado é o que segue:<br><br>
Projeto de Biblioteca Digital<br><br>
Você foi contratado para desenvolver um sistema de biblioteca digital que permite aos usuários acessarem e interagirem com uma coleção de ebooks e vídeos digitais. Sua tarefa é implementar as classes necessárias para representar os itens da biblioteca e as funcionalidades de download de ebooks e de visualização de vídeos digitais.<br>

<br><br>
Requisitos:<br>
• Crie uma classe abstrata ItemBibliotecaDigital que represente um item genérico da biblioteca digital. Esta classe deve ter atributos para o título e o autor do item, além de um método abstrato descricao() que retorna uma descrição do item.<br>
• Defina duas interfaces: Baixavel e Visualizavel, que representam itens que podem ser baixados e visualizados, respectivamente. Cada interface deve ter um método associado (baixar() para Baixavel e visualizar() para Visualizavel).<br>
• Implemente as classes Ebook e VideoDigital, que representam ebooks e vídeos digitais, respectivamente. Ambas devem estender a classe ItemBibliotecaDigital. A classe Ebook deve implementar a interface Baixavel, enquanto a classe VideoDigital deve implementar as interfaces Baixavel e Visualizavel.<br>
• No método main da classe Main, crie alguns ebooks e vídeos digitais, exiba suas descrições e simule o download de ebooks e a visualização de vídeos digitais.<br>

<br><br>
Observações:<br>
• Certifique-se de que as classes e interfaces estão devidamente organizadas e que os métodos estão implementados corretamente, seguindo os requisitos fornecidos.<br>
• Utilize os conceitos de classes abstratas, interfaces, herança e polimorfismo para criar uma estrutura flexível e fácil de expandir.<br>
• Teste o sistema com diversos cenários para garantir seu funcionamento correto

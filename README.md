# 📺 Exercício de Revisão: Netflix Backend Logic (Java)

Este repositório contém um desafio prático focado em **Estruturas de Condição (`if-else` e `switch-case`)**. O objetivo é aplicar os conceitos básicos de Java em um cenário inspirado na arquitetura real da Netflix, que utiliza a JVM para processar milhões de requisições com alta performance.

## 🚀 O Cenário
Você foi contratado para desenvolver o módulo de **Gerenciamento de Experiência do Usuário**. Seu algoritmo deve decidir o que exibir para o cliente com base no tipo de plano, idade do perfil e região.

### Requisitos do Algoritmo

1.  **Validação de Plano (`switch-case`):**
    O sistema deve receber um código de plano (1, 2 ou 3) e exibir:
    * **1 (Básico):** "Resolução 720p - 1 tela disponível."
    * **2 (Padrão):** "Resolução 1080p (Full HD) - 2 telas disponíveis."
    * **3 (Premium):** "Resolução 4K + HDR - 4 telas disponíveis."
    * **Default:** "Código de plano inválido."

2.  **Classificação de Conteúdo (`if-else`):**
    O sistema deve verificar a idade do perfil logado:
    * Se menor que 12 anos: "Categoria: Infantil (Desenhos e Animações)."
    * Se entre 12 e 17 anos: "Categoria: Adolescente (Séries Teen e Aventura)."
    * Se 18 anos ou mais: "Categoria: Adulto (Filmes de Ação e Documentários)."

3.  **Bônus Regional (`if-else` encadeado):**
    Se o usuário for do "Brasil", exibir uma mensagem especial: "Destaque: Assista agora produções originais brasileiras!"

---

## 🛠️ Instruções para Entrega

Para realizar este exercício, siga os passos abaixo:

1.  **Fork este repositório:** Clique no botão "Fork" no canto superior direito para criar uma cópia deste projeto na sua conta pessoal.
2.  **Clone o seu Fork:** Clone o repositório para sua máquina local.
3.  **Desenvolva a Solução:** Crie uma classe chamada `Main.java` (ou utilize a estrutura fornecida na pasta `src`) e implemente a lógica utilizando as classes `Scanner` para entrada de dados.
4.  **Commit e Push:** Após testar seu código, envie as alterações para o **seu** repositório no GitHub.
5.  **Submissão:** O link do seu repositório pessoal deve ser enviado via plataforma da disciplina para avaliação.

---

## 📚 Referência Acadêmica
A Netflix utiliza Java pela robustez do ecossistema, especialmente com o amadurecimento das JVMs modernas e do Spring Boot, permitindo sistemas de alta taxa de transferência e baixa latência. 

> **Saiba mais:** [How Netflix Runs on Java (ByteByteGo)](https://blog.bytebytego.com/p/how-netflix-runs-on-java)
>
> https://www.youtube.com/watch?v=XpunFFS-n8I
>
> https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html
>
> https://docs.oracle.com/en/java/javase/21/gctuning/z-garbage-collector.html

---
**Bons estudos e mãos ao código!** 👨‍🏫💻

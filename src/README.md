📋 ESPECIFICAÇÃO DO PROJETO: Sistema Interno TechBank (v1.0)

De: Diretoria de Operações - TechBank Fintech

Para: Desenvolvedor Java Backend

Assunto: Desenvolvimento do protótipo do nosso sistema de movimentação de contas.

Olá, dev! Estamos validando uma nova operação bancária e precisamos de um sistema rodando direto no terminal para que nossos gerentes internos consigam abrir contas e realizar movimentações básicas para os clientes.

Como este é um protótipo de validação rápida, os dados podem ficar salvos na memória do programa enquanto ele estiver aberto. Abaixo, listamos tudo o que o sistema precisa ter para ser aprovado pela nossa equipe técnica:
1. Regras para as Contas (A Arquitetura)

O sistema deve trabalhar com dois tipos de contas: Conta Corrente e Conta Poupança.

    Segurança Máxima: O saldo de nenhuma conta pode ser alterado diretamente. Ele deve ser protegido. Ninguém pode fazer algo como conta.saldo = 5000. Alterações de saldo só acontecem via depósitos ou saques autorizados pelo sistema.

    Dados Obrigatórios: Toda conta (seja corrente ou poupança) deve registrar:

        Número da conta (gerado sequencialmente ou informado no cadastro).

        Nome do titular.

        Saldo atual.

2. Regras de Negócio Dinâmicas (O Comportamento)

O comportamento dos saques deve mudar dependendo do tipo da conta:

    Operação de Depósito: Deve funcionar igual para as duas contas (soma o valor ao saldo). Não aceitar depósitos de valores negativos ou zerados.

    Saque em Conta Corrente: O cliente pode sacar, mas cada saque tem uma taxa fixa de R$ 2,00 cobrada pela TechBank. Ou seja, se ele sacar R$ 100,00, deve diminuir R$ 102,00 do saldo dele. O sistema não pode deixar o saldo ficar negativo além do necessário.

    Saque em Conta Poupança: O saque é gratuito (sem taxas). Porém, o cliente nunca pode sacar um valor maior do que o saldo atual da poupança.

3. A Interface do Gerente (O Menu de Controle)

Quando o programa iniciar, o gerente deve ver um menu interativo no console que fique rodando em loop até que ele decida sair (Opção 6). O menu precisa ter exatamente estas opções:

    Cadastrar Conta Corrente: Solicitar o nome do titular e o saldo inicial.

    Cadastrar Conta Poupança: Solicitar o nome do titular e o saldo inicial.

    Efetuar Depósito: Perguntar o número da conta e o valor do depósito. Se a conta existir, aplica o depósito.

    Efetuar Saque: Perguntar o número da conta e o valor do saque. Aplica a regra de taxa correspondente ao tipo de conta.

    Consultar Saldo: Perguntar o número da conta e exibir na tela os dados do titular, o tipo da conta (Corrente ou Poupança) e o saldo atual formatado.

    Sair do Sistema: Encerra a execução do programa com uma mensagem de despedida.

🚨 Requisitos Técnicos da nossa Equipe de TI:

Para que nosso time de arquitetura aprove seu código, você deve usar os conceitos de POO:

    Não queremos código duplicado. Use Herança para reaproveitar o que for comum entre as contas.

    Bloqueie a criação de uma conta "genérica". Use Abstração para garantir que só existam contas Correntes ou Poupanças no sistema.

    Use Polimorfismo para diferenciar a regra de cobrança de taxa de saque entre as contas.

    Proteja os atributos usando Encapsulamento (private com métodos de acesso regulados).
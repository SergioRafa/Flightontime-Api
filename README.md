🛫 FlightOnTime API
A FlightOnTime API é o coração de um ecossistema inteligente voltado para a aviação, focado em prever atrasos de voos utilizando Machine Learning e integração de dados em tempo real. O sistema orquestra informações de múltiplas fontes (clima, tráfego e histórico de voos) para fornecer uma probabilidade precisa de pontualidade.

🚀 Tecnologias Utilizadas
Java 17 & Spring Boot 3.2 (Base da API)

Spring WebFlux (WebClient) (Chamadas externas de alta performance)

Jakarta Validation (Garantia de integridade de dados)

Lombok (Produtividade e código limpo)

Python/Flask (Serviço externo de Machine Learning)

🛠️ Funcionalidades Principais
Previsão Híbrida: Aceita entrada manual de dados ou busca automática via número do voo.

Orquestração Real-Time: Preparada para integrar dados da AeroAPI (FlightAware).

Monitoramento de Tráfego: Lógica integrada para avaliar o impacto do trânsito nos aeroportos de destino.

Tratamento de Erros Global: Respostas amigáveis em JSON para facilitar o consumo pelo Front-end.

📈 Desafios Técnicos & Dificuldades
Durante o desenvolvimento (especialmente no calor do Hackathon), enfrentamos obstáculos significativos:

Integração de Tipos: A conversão de dados brutos (Strings/Integers) para objetos de precisão (Double) exigiu refatoração rigorosa para evitar erros de cálculo no modelo de ML.

Ambiente Distribuído: Orquestrar a comunicação entre o Java (Backend) e o Python (ML) demandou uma lógica de fallback robusta para que a API não parasse de funcionar caso o serviço de ML ficasse offline.

Gestão de Portas e Processos: Conflitos de execução simultânea no ambiente de desenvolvimento local (Port 8080) exigiram um gerenciamento cuidadoso dos processos do sistema operacional.

⚠️ Pontos de Melhoria (Roadmap/Limitações)
Como todo projeto em fase de MVP (Mínimo Produto Viável), ainda existem pontos que pretendemos evoluir:

Dependência de Chaves de API: O sistema depende fortemente de chaves de terceiros (AeroAPI). A falta de acesso imediato nos levou a implementar Mocks (simulações) realistas para garantir a continuidade da demo.

Conversão de Unidades: Atualmente, a conversão de Milhas Náuticas para Quilômetros é feita de forma estática; uma versão futura deve considerar rotas geodésicas mais precisas.

Persistência: No estágio atual, a API foca no processamento em tempo real e ainda não implementa um banco de dados para histórico de previsões.

⚙️ Como Rodar o Projeto
Clone o repositório.

Certifique-se de que o Python/Flask esteja rodando na porta 5000.

Execute ./mvnw spring-boot:run ou inicie via sua IDE favorita na porta 8080.

LinkedIn : [ www.linkedin.com/in/sergio-de-oliveira-rafael-47ba29286 ]
Telefone : (24) 999840645
E-mail  : sergiodeoliveirarafael@gmail.com


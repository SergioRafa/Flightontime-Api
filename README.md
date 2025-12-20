

🛫 FlightOnTime API
Projeto de Ciência de Dados e Back-End - Hackathon ONE

A FlightOnTime API é uma solução preditiva de alta precisão que estima o risco de atraso em decolagens. O sistema orquestra dados de múltiplas fontes, integrando um modelo de Machine Learning (Python) com um orquestrador Java/Spring Boot, consumindo condições meteorológicas reais em tempo real.

🚀 Tecnologias Utilizadas
Java 17 & Spring Boot 3.2: Core do sistema e orquestração de APIs.

Python 3.x / Flask: Microserviço de Machine Learning (Scikit-Learn).

StormGlass API: Integração de dados climáticos reais (Temperatura e Vento).

Spring WebFlux: Comunicação assíncrona entre serviços.

Frontend (HTML5/CSS3/JS): Dashboard dinâmico com feedback visual de risco.

🛠️ Funcionalidades & Diferenciais (MVP+)
Análise Preditiva Híbrida: Combina variáveis históricas com dados climáticos em tempo real.

Monitoramento de Tráfego: Identifica congestionamentos em aeroportos críticos (ex: GRU/GIG).

Dashboard Visual: Interface que classifica o risco em Baixo (Verde), Moderado (Amarelo) ou Alto (Vermelho).

Resiliência (Fallback): Caso as APIs externas fiquem offline, o sistema ativa uma base de dados histórica para garantir a continuidade da operação.

⚙️ Configuração e Instalação
1. Requisitos
Java 17 instalado.

Python 3.10+ instalado.

Chave de API do StormGlass.

2. Variáveis de Ambiente
Para segurança e flexibilidade, o projeto utiliza variáveis de ambiente. No IntelliJ ou Terminal, configure:

Bash
CLIMA_API_KEY=sua_chave_stormglass_aqui
3. Rodando o Microserviço de ML (Python)
Bash
cd ml-server
pip install -r requirements.txt
python app.py
# Rodando em http://localhost:5000
4. Rodando o Orquestrador (Java)
Bash
./mvnw spring-boot:run
# Rodando em http://localhost:8085
📡 Documentação da API
Endpoint de Predição
POST /api/previsao/predict

Corpo da Requisição (JSON):

JSON
{
  "origem": "GIG",
  "destino": "GRU",
  "distanciaKm": 440,
  "dataPartida": "2025-12-20T12:00:00"
}
Exemplo de Resposta (JSON):

JSON
{
  "previsao": "Risco Moderado",
  "probabilidade": 20,
  "clima": {
    "temp": 23.8,
    "vento": 4.9
  }
}
📈 Exemplos para Teste (Apresentação)
Voo Pontual (Risco Baixo): Origem GIG, Destino GRU, Distância 400.

Risco de Atraso (Risco Alto): Origem GRU (Tráfego Crítico), Distância 700.

Erro de Validação: Enviar campo origem vazio (Retorna 400 Bad Request).

📊 Jornada de Desenvolvimento
Ponte Poliglota: Superamos o desafio de converter tipos de dados entre Java (Double) e Python (float64) para garantir a precisão do modelo.

Arquitetura Resiliente: Implementamos filtros de segurança para que falhas em APIs de terceiros não interrompam o serviço principal.

📫 Contato
LinkedIn: Sergio de Oliveira Rafael

E-mail: sergiodeoliveirarafael@gmail.com

Telefone: (24) 99984-0645

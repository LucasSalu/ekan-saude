# API de Beneficiários de Plano de Saúde

## Descrição
Esta aplicação é uma API REST para gerenciar beneficiários de um plano de saúde e seus documentos.

## Requisitos
- Java 11+
- Maven

## Configuração e Execução
1. Clone o repositório:
   https://github.com/LucasSalu/ekan-saude.git

##Endpoints
Beneficiários
POST /api/beneficiarios - Cadastrar um beneficiário
GET /api/beneficiarios - Listar todos os beneficiários
GET /api/beneficiarios/{id} - Obter um beneficiário por ID
PUT /api/beneficiarios/{id} - Atualizar um beneficiário
DELETE /api/beneficiarios/{id} - Remover um beneficiário
GET api/documentos/beneficiario/{id} Obter documetos de um beneficiario.

cd ekan
mvn spring-boot:run

## Para acessar o Swagger.
http://localhost:8080/swagger-ui/index.html#

## Para acessar o banco
http://localhost:8080/h2-console/

## Exemplo de Json para criar Beneficiario e Documento
{
  "id": null,
  "nome": "João Silva",
  "telefone": "(11) 98765-4321",
  "dataNascimento": "1980-01-01",
  "dataInclusao": "2024-06-07T16:41:12.707Z",
  "dataAtualizacao": "2024-06-07T16:41:12.707Z",
  "documentos": [
    {
      "id": null,
      "tipoDocumento": "RG",
      "descricao": "Documento de Identidade",
      "dataInclusao": "2024-06-07T16:41:12.707Z",
      "dataAtualizacao": "2024-06-07T16:41:12.707Z",
      "beneficiarioId": null
    }
  ]
}

## Login e Senha
login:adm 
senha:adm

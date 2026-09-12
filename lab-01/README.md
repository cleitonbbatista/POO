# Sistema de Controle de Versão

## Configuração inicial para uso do Git
### Configuração de nome de usuário e e-mail no Git
A configuração do nome e e-mail do usuário é uma etapa fundamental no controle de versão, pois são essas configurações que permitem a identificação do usuário responsável pela modificação (commit) realizado no Git.


```
# Configurar nome de usuário:
git config --global user.name "Nome do usuário"

# Configurar e-mail:
git config --global user.email "usuario@email.com"
```

### Criando Personal Access Token (PAT) no GitHub

O *Personal Access Token* é uma chave de acesso utilizada como uma senha alternativa ou chave de autenticação gerada pelo GitHub, tendo diversas possibilidades de autorizações. Ela é comumente utilizada para ações como o *git push*, uma vez que não é possível utilizar a senha da conta pessoal para autorizar a ação.

**Passo a passo para criar seu PAT:**
1. Acesse sua conta no GitHub;
2. Entre nas configurações da conta por meio do ícone do perfil;
3. Busque a opção *Developer Settings*;
4. Selecione *Personal access tokens* e escolha "*Tokens (classic)*";
5. Clique em *Generate new token* e, em seguida, "*Generate new token (classic)*";
6. Dê um nome para o token (de preferência que faça sentido com o uso);
7. Escolha a duração do token;
8. Selecione as permissões de uso que deseja;
9. Clique em *Generate token*, copie-o e use conforme sua necessidade.

### Salvar em cache as credenciais do PAT

Durante o desenvolvimento, por vezes é necessário o uso do PAT diversas vezes, o que acaba por prejudicar a produtividade. Por esse motivo, ter a chave memorizada pelo computador temporariamente é algo quase indispensável, fazendo com que um único uso seja válido para toda a sessão de desenvolvimento.

```
# Comando para configuração de cache em 1h:
git config --global credential.helper 'cache --timeout=3600'
```

## Qual a diferença entre git merge e git rebase?


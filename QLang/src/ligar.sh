
#!/bin/bash
# executar


javac -cp antlr4-runtime-4.9.2.jar ./GrammarQ/*.java


if [ $? -eq 0 ]; then
    echo "Compilação bem-sucedida."
    
    
    java -cp .:antlr4-runtime-4.9.2.jar ./GrammarQ/QuestionsMain
    
    if [ $? -eq 0 ]; then
        echo "Execução bem-sucedida."
    else
        echo "Erro durante a execução do programa Java."
    fi
else
    echo "Erro durante a compilação."
fi

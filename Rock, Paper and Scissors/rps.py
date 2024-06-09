import random as rd     
import os               
import time     

def clear():            
    os.system('cls' if os.name == 'nt' else 'clear')

def game():             
    player_score = 0    
    play = True         

    while play:         
        clear()         

        print('Pedra, Papel ou Tesoura?')  
        player = input().strip().lower()           

        if player == 'pedra' or player == 'papel' or player == 'tesoura':  
        
            computer = rd.choice(['pedra', 'papel', 'tesoura'])
            
            print(f'\nVocê escolheu {player} e o computador escolheu {computer}\n')

            if player == computer:  
                print('Empate!')
            elif player == 'pedra':  
                if computer == 'papel':
                    print('Você perdeu!')
                else:
                    print('Você ganhou!')
                    player_score += 1
            elif player == 'papel':  
                if computer == 'tesoura':
                    print('Você perdeu!')
                else:
                    print('Você ganhou!')
                    player_score += 1
            elif player == 'tesoura':  
                if computer == 'pedra':
                    print('Você perdeu!')
                else:
                    print('Você ganhou!')
                    player_score += 1
        else:
            print('Opção inválida!')

        print('Deseja jogar novamente? (s/n)')  
        play = input().strip().lower()  
        if play != 's' and play != 'sim':
            play = False
        else:
            play = False
        
    print('\nFim de jogo!')
    print(f'Você jogou {player_score} rodada(s) e venceu {player_score} rodada(s)!\n')
    print(f'\nSua pontuação final é {player_score}\n')

game()
print('\nAté a próxima!')
time.sleep(2)
clear()

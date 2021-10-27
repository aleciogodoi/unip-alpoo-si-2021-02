
public class TesteEleicao {

	public static void main(String[] args) {
		Eleicao eleicao = new Eleicao();
		
		Votacao votacao = new Votacao(eleicao);
		votacao.setVisible(true);
		votacao.pack();

		EleicaoView4 viewFrame = new EleicaoView4(eleicao);
		viewFrame.setVisible(true);
		viewFrame.pack();

		
		EleicaoView2 viewTotal = new EleicaoView2(eleicao);
		EleicaoView view = new EleicaoView(eleicao);
		eleicao.setVoto(0);
		eleicao.setVoto(1);
		eleicao.setVoto(2);
		eleicao.setVoto(3);
		eleicao.setVoto(0);
		eleicao.setVoto(3);
	}
}
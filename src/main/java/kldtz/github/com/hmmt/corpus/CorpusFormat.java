package kldtz.github.com.hmmt.corpus;

import java.io.File;

public enum CorpusFormat {
	CONLL {
		@Override
		public CorpusFileReader createCorpusFileReader(File corpusFile) {
			return new ConllFileReader(corpusFile);
		}
	},
	BROWN {
		@Override
		public CorpusFileReader createCorpusFileReader(File corpusFile) {
			return new BrownFileReader(corpusFile);
		}
	},
	GERMEVAL {
		@Override
		public CorpusFileReader createCorpusFileReader(File corpusFile) {
			return new GermEvalReader(corpusFile);
		}
	};
	
	public abstract CorpusFileReader createCorpusFileReader(File corpusFile);
}
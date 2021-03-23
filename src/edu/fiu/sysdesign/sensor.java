package edu.fiu.sysdesign;

public class sensor implements SelfCheckCapable {

	string camera;

/**
 * tracking the light
 */
	void lighttrackig() {
		
	}
     /**
	 * tracking the line
	 */
		void linetrackig() {
			
		}
		/**
		 * tracking the obstackle
		 */
			void obstackletrackig() {
				
			}
			
			/**
			 * tracking the face
			 */
				void facetrackig() {
					
				}
	@Override
	public String getComponentName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean selfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean runSelfCheck() {
		// TODO Auto-generated method stub
		return false;
	}

}

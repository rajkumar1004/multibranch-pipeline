			pipeline
			{
				agent any
				stages
				{
					stage('Checkout')
					{
						steps
						{
							git url: 'https://github.com/rajkumar1004/multibranch-pipeline.git',
							branch: 'main'
						}
					}
				}
				}
			}

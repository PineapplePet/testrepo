#!/usr/bin/env groovy
node {
	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/PineapplePet/testrepo.git'], []]])

	build 'testItem'
}
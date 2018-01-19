#!/usr/bin/env groovy
checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/PineapplePet/testrepo.git'], []]])
build 'testItem'
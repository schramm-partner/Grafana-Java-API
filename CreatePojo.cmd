@REM
@REM Copyright © 2010-2014 Nokia
@REM
@REM Licensed under the Apache License, Version 2.0 (the "License");
@REM you may not use this file except in compliance with the License.
@REM You may obtain a copy of the License at
@REM
@REM      http://www.apache.org/licenses/LICENSE-2.0
@REM
@REM Unless required by applicable law or agreed to in writing, software
@REM distributed under the License is distributed on an "AS IS" BASIS,
@REM WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
@REM See the License for the specific language governing permissions and
@REM limitations under the License.
@REM

@echo off

java -jar "%~dp0/../lib/jsonschema2pojo-cli-1.0.0-alpha2.jar" -a GSON --disable-setters -S -E -s ".\Grafana-Java-API\src\schema\config" -t ".\Grafana-Java-API\src" -p org.grafana.api.config -T JSONSCHEMA
java -jar "%~dp0/../lib/jsonschema2pojo-cli-1.0.0-alpha2.jar" -a GSON --disable-setters -S -E -s ".\Grafana-Java-API\src\responses" -t ".\Grafana-Java-API\src" -p org.grafana.api.responses -T JSON --class-suffix "Rsp"
java -jar "%~dp0/../lib/jsonschema2pojo-cli-1.0.0-alpha2.jar" -a GSON                   -S -E -s ".\Grafana-Java-API\src\templates" -t ".\Grafana-Java-API\src" -p org.grafana.api.templates -T JSON --class-suffix "Tpl"

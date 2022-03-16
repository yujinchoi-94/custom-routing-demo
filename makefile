build-CustomRuntimeRoutingDemo:
	@ ./mvnw test
	@ sh ./run-dev-container.sh -r
	@ unzip -o ./target/custom-runtime-routing-demo-0.0.1-SNAPSHOT-native-zip.zip
	@ cp ./bootstrap ${ARTIFACTS_DIR}
	@ cp ./custom-runtime-routing-demo ${ARTIFACTS_DIR}
# for custom runtime configuration
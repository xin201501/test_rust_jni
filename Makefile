.PHNOY:default
default:src/* librust_lib.so lib_cxx_lib.so
	@cd src && javac Main.java && mv Main.class ../bin

.PHNOY:librust_lib.so
librust_lib.so:rust-lib/src/* rust-lib/Cargo.toml
	@echo "Building Rust library..."
	@cd rust-lib && cargo build --release
	@echo "Copying Rust library to the project bin folder..."
	@mkdir -p bin
	@cp rust-lib/target/release/librust_lib.so ./bin

.PHNOY:lib_cxx_lib.so
lib_cxx_lib.so:cxx-lib/*.cpp cxx-lib/CMakeLists.txt
	@echo "Building C++ library..."
	@cd cxx-lib && mkdir -p build && cd build && cmake .. && cmake --build .
	@echo "Copying C++ library to the project bin folder..."
	@mkdir -p bin
	@cp cxx-lib/build/libcxx_lib.so ./bin

.PHNOY:run
run:default
	@echo "\nRunning Java program..."
	@cd bin && java Main

.PHNOY:clean
clean:
	@echo "Cleaning up..."
	@cd rust-lib && cargo clean
	@cd cxx-lib && rm -rf build/ .cache/
	@rm -rf bin/
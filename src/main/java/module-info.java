import com.github.asyncmc.protocol.raknet.api.RakNetAPI;

module com.github.asyncmc.protocol.raknet.api {
    requires kotlin.stdlib;
    requires kotlin.stdlib.jdk7;
    requires kotlin.stdlib.jdk8;
    requires ktor.io.jvm;

    exports com.github.asyncmc.protocol.raknet.api;
    uses RakNetAPI;
}

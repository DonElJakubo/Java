package rekru.rozmowy.NokiaJavaFullstackWorkingStudent.zadaniaDoRozmowy.docker;



//public class DockerExample {
//
//     Utwórz obiekt DockerClient
//    DockerClient dockerClient = DockerClientBuilder.getInstance().build();
//
//    public void runDocker() {
//
//         Utwórz i uruchom kontener JVM
//        CreateContainerResponse container = dockerClient.createContainerCmd("openjdk:8-jdk-alpine")
//                .withEntrypoint("java", "-jar", "/app.jar")
//                .withCmd("java", "-jar", "/app.jar")
//                .exec();
//        dockerClient.startContainerCmd(container.getId()).exec();
//
//         Przekaż zmienne środowiskowe do kontenera
//        dockerClient.createContainerCmd(container.getId())
//                .withEnv("VARIABLE_NAME", "VALUE")
//                .exec();
//
//         Przekaż pliki do kontenera
//        String filePath = "/path/to/file.txt";
//        String containerPath = "/container/path/file.txt";
//        dockerClient.copyArchiveToContainerCmd(container.getId())
//                .withHostResource(filePath)
//                .withRemotePath(containerPath)
//                .exec();
//
//         Zatrzymaj i usuń kontener
//        dockerClient.stopContainerCmd(container.getId()).exec();
//        dockerClient.removeContainerCmd(container.getId()).exec();
//
//    }
//
//    public static void main(String[] args) {
//        new DockerExample().runDocker();
//    }
//}
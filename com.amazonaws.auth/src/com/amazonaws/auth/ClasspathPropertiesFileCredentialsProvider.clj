(ns com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider
  "AWSCredentialsProvider implementation that loads AWS security
  credentials from a properties file on the classpath. The default
  constructor creates a credentials provider that loads the credentials
  from a file named AwsCredentials.properties on the
  classpath, but which file to use from the classpath can also be controled
  through the one-argument constructor.

  The AWS access key ID is expected to be in the accessKey
  property and the AWS secret key is expected to be in the
  secretKey property."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.auth ClasspathPropertiesFileCredentialsProvider]))

(defn ->classpath-properties-file-credentials-provider
  "Constructor.

  Creates a new ClasspathPropertiesFileCredentialsProvider that will
   attempt to load a custom file from the classpath to read AWS security
   credentials.

  credentials-file-path - The custom classpath resource path to a properties file from which the AWS security credentials should be loaded. For example, com/mycompany/credentials.properties beta-credentials.properties AwsCredentials.properties - `java.lang.String`"
  (^ClasspathPropertiesFileCredentialsProvider [^java.lang.String credentials-file-path]
    (new ClasspathPropertiesFileCredentialsProvider credentials-file-path))
  (^ClasspathPropertiesFileCredentialsProvider []
    (new ClasspathPropertiesFileCredentialsProvider )))

(defn get-credentials
  "Description copied from interface: AWSCredentialsProvider

  returns: AWSCredentials which the caller can use to authorize an AWS request. - `com.amazonaws.auth.AWSCredentials`"
  (^com.amazonaws.auth.AWSCredentials [^ClasspathPropertiesFileCredentialsProvider this]
    (-> this (.getCredentials))))

(defn refresh
  "Description copied from interface: AWSCredentialsProvider"
  ([^ClasspathPropertiesFileCredentialsProvider this]
    (-> this (.refresh))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ClasspathPropertiesFileCredentialsProvider this]
    (-> this (.toString))))


(ns com.amazonaws.services.signer.AWSsignerAsyncClient
  "Client for accessing signer asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


  You can use Code Signing for Amazon FreeRTOS (AWS Signer) to sign code that you created for any of the IoT devices
  that Amazon Web Services supports. AWS Signer is integrated with Amazon FreeRTOS, AWS Certificate Manager, and AWS
  CloudTrail. Amazon FreeRTOS customers can use AWS Signer to sign code images before making them available for
  microcontrollers. You can use ACM to import third-party certificates to be used by AWS Signer. For general
  information about using AWS Signer, see the Code Signing for Amazon FreeRTOS
  Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AWSsignerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.signer.AWSsignerAsyncClientBuilder`"
  (^com.amazonaws.services.signer.AWSsignerAsyncClientBuilder []
    (AWSsignerAsyncClient/asyncBuilder )))

(defn cancel-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.CancelSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.CancelSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest request]
    (-> this (.cancelSigningProfileAsync request))))

(defn get-signing-platform-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.GetSigningPlatformRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningPlatform operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningPlatformResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningPlatformAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest request]
    (-> this (.getSigningPlatformAsync request))))

(defn list-signing-profiles-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningProfilesResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest request]
    (-> this (.listSigningProfilesAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSsignerAsyncClient this]
    (-> this (.getExecutorService))))

(defn describe-signing-job-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.DescribeSigningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.DescribeSigningJobResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSigningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest request]
    (-> this (.describeSigningJobAsync request))))

(defn get-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.GetSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.GetSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.GetSigningProfileRequest request]
    (-> this (.getSigningProfileAsync request))))

(defn start-signing-job-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.StartSigningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.StartSigningJobResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.StartSigningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSigningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.StartSigningJobRequest request]
    (-> this (.startSigningJobAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSsignerAsyncClient this]
    (-> this (.shutdown))))

(defn put-signing-profile-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.PutSigningProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.PutSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.PutSigningProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSigningProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.PutSigningProfileRequest request]
    (-> this (.putSigningProfileAsync request))))

(defn list-signing-jobs-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningJobsResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningJobsRequest request]
    (-> this (.listSigningJobsAsync request))))

(defn list-signing-platforms-async
  "Description copied from interface: AWSsignerAsync

  request - `com.amazonaws.services.signer.model.ListSigningPlatformsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningPlatforms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningPlatformsResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningPlatformsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsyncClient this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest request]
    (-> this (.listSigningPlatformsAsync request))))


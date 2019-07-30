(ns com.amazonaws.services.signer.AWSsignerAsync
  "Interface for accessing signer asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSsignerAsync instead.



  You can use Code Signing for Amazon FreeRTOS (AWS Signer) to sign code that you created for any of the IoT devices
  that Amazon Web Services supports. AWS Signer is integrated with Amazon FreeRTOS, AWS Certificate Manager, and AWS
  CloudTrail. Amazon FreeRTOS customers can use AWS Signer to sign code images before making them available for
  microcontrollers. You can use ACM to import third-party certificates to be used by AWS Signer. For general
  information about using AWS Signer, see the Code Signing for Amazon FreeRTOS
  Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.signer AWSsignerAsync]))

(defn cancel-signing-profile-async
  "Changes the state of an ACTIVE signing profile to CANCELED. A canceled profile is still
   viewable with the ListSigningProfiles operation, but it cannot perform new signing jobs, and is
   deleted two years after cancelation.

  cancel-signing-profile-request - `com.amazonaws.services.signer.model.CancelSigningProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.CancelSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest cancel-signing-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelSigningProfileAsync cancel-signing-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.CancelSigningProfileRequest cancel-signing-profile-request]
    (-> this (.cancelSigningProfileAsync cancel-signing-profile-request))))

(defn get-signing-platform-async
  "Returns information on a specific signing platform.

  get-signing-platform-request - `com.amazonaws.services.signer.model.GetSigningPlatformRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningPlatform operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningPlatformResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest get-signing-platform-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningPlatformAsync get-signing-platform-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningPlatformRequest get-signing-platform-request]
    (-> this (.getSigningPlatformAsync get-signing-platform-request))))

(defn list-signing-profiles-async
  "Lists all available signing profiles in your AWS account. Returns only profiles with an ACTIVE
   status unless the includeCanceled request field is set to true. If additional jobs
   remain to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to
   ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs
   with your maxResults parameter and with new values that AWS Signer returns in the
   nextToken parameter until all of your signing jobs have been returned.

  list-signing-profiles-request - `com.amazonaws.services.signer.model.ListSigningProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningProfilesResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest list-signing-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningProfilesAsync list-signing-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningProfilesRequest list-signing-profiles-request]
    (-> this (.listSigningProfilesAsync list-signing-profiles-request))))

(defn describe-signing-job-async
  "Returns information about a specific code signing job. You specify the job by using the jobId value
   that is returned by the StartSigningJob operation.

  describe-signing-job-request - `com.amazonaws.services.signer.model.DescribeSigningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.DescribeSigningJobResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest describe-signing-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSigningJobAsync describe-signing-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.DescribeSigningJobRequest describe-signing-job-request]
    (-> this (.describeSigningJobAsync describe-signing-job-request))))

(defn get-signing-profile-async
  "Returns information on a specific signing profile.

  get-signing-profile-request - `com.amazonaws.services.signer.model.GetSigningProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.GetSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningProfileRequest get-signing-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSigningProfileAsync get-signing-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.GetSigningProfileRequest get-signing-profile-request]
    (-> this (.getSigningProfileAsync get-signing-profile-request))))

(defn start-signing-job-async
  "Initiates a signing job to be performed on the code provided. Signing jobs are viewable by the
   ListSigningJobs operation for two years after they are performed. Note the following requirements:




   You must create an Amazon S3 source bucket. For more information, see Create a Bucket in the Amazon
   S3 Getting Started Guide.




   Your S3 source bucket must be version enabled.




   You must create an S3 destination bucket. AWS Signer uses your S3 destination bucket to write your signed code.




   You specify the name of the source and destination buckets when calling the StartSigningJob
   operation.




   You must also specify a request token that identifies your request to AWS Signer.




   You can call the DescribeSigningJob and the ListSigningJobs actions after you call
   StartSigningJob.


   For a Java example that shows how to use this action, see http://docs.aws.amazon.com/acm/latest/userguide/

  start-signing-job-request - `com.amazonaws.services.signer.model.StartSigningJobRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSigningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.StartSigningJobResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.StartSigningJobRequest start-signing-job-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSigningJobAsync start-signing-job-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.StartSigningJobRequest start-signing-job-request]
    (-> this (.startSigningJobAsync start-signing-job-request))))

(defn put-signing-profile-async
  "Creates a signing profile. A signing profile is an AWS Signer template that can be used to carry out a
   pre-defined signing job. For more information, see http://docs.aws.amazon.com/signer/latest/developerguide/gs-profile.html

  put-signing-profile-request - `com.amazonaws.services.signer.model.PutSigningProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutSigningProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.PutSigningProfileResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.PutSigningProfileRequest put-signing-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putSigningProfileAsync put-signing-profile-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.PutSigningProfileRequest put-signing-profile-request]
    (-> this (.putSigningProfileAsync put-signing-profile-request))))

(defn list-signing-jobs-async
  "Lists all your signing jobs. You can use the maxResults parameter to limit the number of signing
   jobs that are returned in the response. If additional jobs remain to be listed, AWS Signer returns a
   nextToken value. Use this value in subsequent calls to ListSigningJobs to fetch the
   remaining values. You can continue calling ListSigningJobs with your maxResults
   parameter and with new values that AWS Signer returns in the nextToken parameter until all of your
   signing jobs have been returned.

  list-signing-jobs-request - `com.amazonaws.services.signer.model.ListSigningJobsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningJobsResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningJobsRequest list-signing-jobs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningJobsAsync list-signing-jobs-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningJobsRequest list-signing-jobs-request]
    (-> this (.listSigningJobsAsync list-signing-jobs-request))))

(defn list-signing-platforms-async
  "Lists all signing platforms available in AWS Signer that match the request parameters. If additional jobs remain
   to be listed, AWS Signer returns a nextToken value. Use this value in subsequent calls to
   ListSigningJobs to fetch the remaining values. You can continue calling ListSigningJobs
   with your maxResults parameter and with new values that AWS Signer returns in the
   nextToken parameter until all of your signing jobs have been returned.

  list-signing-platforms-request - `com.amazonaws.services.signer.model.ListSigningPlatformsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningPlatforms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.signer.model.ListSigningPlatformsResult>`"
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest list-signing-platforms-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningPlatformsAsync list-signing-platforms-request async-handler)))
  (^java.util.concurrent.Future [^AWSsignerAsync this ^com.amazonaws.services.signer.model.ListSigningPlatformsRequest list-signing-platforms-request]
    (-> this (.listSigningPlatformsAsync list-signing-platforms-request))))


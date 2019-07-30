(ns com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClient
  "Client for accessing SageMaker asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.


  Provides APIs for creating and managing Amazon SageMaker resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sagemaker AmazonSageMakerAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClientBuilder`"
  (^com.amazonaws.services.sagemaker.AmazonSageMakerAsyncClientBuilder []
    (AmazonSageMakerAsyncClient/asyncBuilder )))

(defn create-labeling-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLabelingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateLabelingJobRequest request]
    (-> this (.createLabelingJobAsync request))))

(defn create-hyper-parameter-tuning-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateHyperParameterTuningJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createHyperParameterTuningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateHyperParameterTuningJobRequest request]
    (-> this (.createHyperParameterTuningJobAsync request))))

(defn create-training-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTrainingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateTrainingJobRequest request]
    (-> this (.createTrainingJobAsync request))))

(defn update-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceRequest request]
    (-> this (.updateNotebookInstanceAsync request))))

(defn update-code-repository-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCodeRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateCodeRepositoryRequest request]
    (-> this (.updateCodeRepositoryAsync request))))

(defn list-endpoints-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListEndpointsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListEndpointsRequest request]
    (-> this (.listEndpointsAsync request))))

(defn describe-endpoint-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeEndpointRequest request]
    (-> this (.describeEndpointAsync request))))

(defn list-workteams-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListWorkteamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListWorkteams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListWorkteamsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listWorkteamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListWorkteamsRequest request]
    (-> this (.listWorkteamsAsync request))))

(defn stop-compilation-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopCompilationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopCompilationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopCompilationJobRequest request]
    (-> this (.stopCompilationJobAsync request))))

(defn create-presigned-notebook-instance-url-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePresignedNotebookInstanceUrl operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPresignedNotebookInstanceUrlAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreatePresignedNotebookInstanceUrlRequest request]
    (-> this (.createPresignedNotebookInstanceUrlAsync request))))

(defn delete-algorithm-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAlgorithmAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteAlgorithmRequest request]
    (-> this (.deleteAlgorithmAsync request))))

(defn describe-code-repository-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCodeRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeCodeRepositoryRequest request]
    (-> this (.describeCodeRepositoryAsync request))))

(defn start-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StartNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StartNotebookInstanceRequest request]
    (-> this (.startNotebookInstanceAsync request))))

(defn create-algorithm-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAlgorithmAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateAlgorithmRequest request]
    (-> this (.createAlgorithmAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonSageMakerAsyncClient this]
    (-> this (.getExecutorService))))

(defn render-ui-template-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenderUiTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.RenderUiTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renderUiTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.RenderUiTemplateRequest request]
    (-> this (.renderUiTemplateAsync request))))

(defn create-endpoint-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateEndpointRequest request]
    (-> this (.createEndpointAsync request))))

(defn list-tags-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTagsRequest request]
    (-> this (.listTagsAsync request))))

(defn delete-tags-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn update-endpoint-weights-and-capacities-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpointWeightsAndCapacities operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointWeightsAndCapacitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateEndpointWeightsAndCapacitiesRequest request]
    (-> this (.updateEndpointWeightsAndCapacitiesAsync request))))

(defn list-training-jobs-for-hyper-parameter-tuning-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrainingJobsForHyperParameterTuningJob operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrainingJobsForHyperParameterTuningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsForHyperParameterTuningJobRequest request]
    (-> this (.listTrainingJobsForHyperParameterTuningJobAsync request))))

(defn stop-transform-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopTransformJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTransformJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopTransformJobRequest request]
    (-> this (.stopTransformJobAsync request))))

(defn describe-compilation-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCompilationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeCompilationJobRequest request]
    (-> this (.describeCompilationJobAsync request))))

(defn list-notebook-instance-lifecycle-configs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNotebookInstanceLifecycleConfigs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNotebookInstanceLifecycleConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListNotebookInstanceLifecycleConfigsRequest request]
    (-> this (.listNotebookInstanceLifecycleConfigsAsync request))))

(defn create-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateWorkteamRequest request]
    (-> this (.createWorkteamAsync request))))

(defn create-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceRequest request]
    (-> this (.createNotebookInstanceAsync request))))

(defn get-search-suggestions-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSearchSuggestions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.GetSearchSuggestionsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSearchSuggestionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.GetSearchSuggestionsRequest request]
    (-> this (.getSearchSuggestionsAsync request))))

(defn list-algorithms-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAlgorithms operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListAlgorithmsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAlgorithmsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListAlgorithmsRequest request]
    (-> this (.listAlgorithmsAsync request))))

(defn update-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateWorkteamRequest request]
    (-> this (.updateWorkteamAsync request))))

(defn describe-subscribed-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSubscribedWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSubscribedWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeSubscribedWorkteamRequest request]
    (-> this (.describeSubscribedWorkteamAsync request))))

(defn create-transform-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateTransformJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTransformJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateTransformJobRequest request]
    (-> this (.createTransformJobAsync request))))

(defn delete-endpoint-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpointAsync request))))

(defn describe-endpoint-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeEndpointConfigRequest request]
    (-> this (.describeEndpointConfigAsync request))))

(defn describe-training-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrainingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeTrainingJobRequest request]
    (-> this (.describeTrainingJobAsync request))))

(defn stop-labeling-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopLabelingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopLabelingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopLabelingJobRequest request]
    (-> this (.stopLabelingJobAsync request))))

(defn list-endpoint-configs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointConfigs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListEndpointConfigsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointConfigsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListEndpointConfigsRequest request]
    (-> this (.listEndpointConfigsAsync request))))

(defn delete-notebook-instance-lifecycle-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotebookInstanceLifecycleConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceLifecycleConfigRequest request]
    (-> this (.deleteNotebookInstanceLifecycleConfigAsync request))))

(defn describe-labeling-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeLabelingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeLabelingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeLabelingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeLabelingJobRequest request]
    (-> this (.describeLabelingJobAsync request))))

(defn describe-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceRequest request]
    (-> this (.describeNotebookInstanceAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonSageMakerAsyncClient this]
    (-> this (.shutdown))))

(defn describe-algorithm-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAlgorithm operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeAlgorithmResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAlgorithmAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeAlgorithmRequest request]
    (-> this (.describeAlgorithmAsync request))))

(defn delete-model-package-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelPackageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteModelPackageRequest request]
    (-> this (.deleteModelPackageAsync request))))

(defn delete-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteWorkteamRequest request]
    (-> this (.deleteWorkteamAsync request))))

(defn create-compilation-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCompilationJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateCompilationJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCompilationJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateCompilationJobRequest request]
    (-> this (.createCompilationJobAsync request))))

(defn list-training-jobs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTrainingJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTrainingJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTrainingJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTrainingJobsRequest request]
    (-> this (.listTrainingJobsAsync request))))

(defn describe-model-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeModelRequest request]
    (-> this (.describeModelAsync request))))

(defn update-notebook-instance-lifecycle-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateNotebookInstanceLifecycleConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateNotebookInstanceLifecycleConfigRequest request]
    (-> this (.updateNotebookInstanceLifecycleConfigAsync request))))

(defn delete-model-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteModelRequest request]
    (-> this (.deleteModelAsync request))))

(defn describe-transform-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTransformJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeTransformJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTransformJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeTransformJobRequest request]
    (-> this (.describeTransformJobAsync request))))

(defn create-notebook-instance-lifecycle-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createNotebookInstanceLifecycleConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateNotebookInstanceLifecycleConfigRequest request]
    (-> this (.createNotebookInstanceLifecycleConfigAsync request))))

(defn describe-hyper-parameter-tuning-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHyperParameterTuningJob operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHyperParameterTuningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeHyperParameterTuningJobRequest request]
    (-> this (.describeHyperParameterTuningJobAsync request))))

(defn search-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.SearchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Search operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.SearchResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.SearchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.SearchRequest request]
    (-> this (.searchAsync request))))

(defn list-models-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListModelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListModels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListModelsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListModelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listModelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListModelsRequest request]
    (-> this (.listModelsAsync request))))

(defn create-model-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateModelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateModelResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateModelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateModelRequest request]
    (-> this (.createModelAsync request))))

(defn delete-endpoint-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteEndpointConfigRequest request]
    (-> this (.deleteEndpointConfigAsync request))))

(defn list-hyper-parameter-tuning-jobs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHyperParameterTuningJobs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHyperParameterTuningJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListHyperParameterTuningJobsRequest request]
    (-> this (.listHyperParameterTuningJobsAsync request))))

(defn create-code-repository-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCodeRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateCodeRepositoryRequest request]
    (-> this (.createCodeRepositoryAsync request))))

(defn list-labeling-jobs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLabelingJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListLabelingJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLabelingJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsRequest request]
    (-> this (.listLabelingJobsAsync request))))

(defn list-labeling-jobs-for-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLabelingJobsForWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLabelingJobsForWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListLabelingJobsForWorkteamRequest request]
    (-> this (.listLabelingJobsForWorkteamAsync request))))

(defn stop-hyper-parameter-tuning-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopHyperParameterTuningJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopHyperParameterTuningJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopHyperParameterTuningJobRequest request]
    (-> this (.stopHyperParameterTuningJobAsync request))))

(defn delete-code-repository-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCodeRepository operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCodeRepositoryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteCodeRepositoryRequest request]
    (-> this (.deleteCodeRepositoryAsync request))))

(defn describe-notebook-instance-lifecycle-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeNotebookInstanceLifecycleConfig operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeNotebookInstanceLifecycleConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeNotebookInstanceLifecycleConfigRequest request]
    (-> this (.describeNotebookInstanceLifecycleConfigAsync request))))

(defn create-endpoint-config-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpointConfig operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateEndpointConfigResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointConfigAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateEndpointConfigRequest request]
    (-> this (.createEndpointConfigAsync request))))

(defn describe-model-package-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeModelPackageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeModelPackageRequest request]
    (-> this (.describeModelPackageAsync request))))

(defn stop-training-job-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopTrainingJobRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopTrainingJob operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopTrainingJobResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopTrainingJobAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopTrainingJobRequest request]
    (-> this (.stopTrainingJobAsync request))))

(defn list-compilation-jobs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCompilationJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListCompilationJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCompilationJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListCompilationJobsRequest request]
    (-> this (.listCompilationJobsAsync request))))

(defn list-subscribed-workteams-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscribedWorkteams operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscribedWorkteamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListSubscribedWorkteamsRequest request]
    (-> this (.listSubscribedWorkteamsAsync request))))

(defn list-transform-jobs-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListTransformJobsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTransformJobs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListTransformJobsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTransformJobsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListTransformJobsRequest request]
    (-> this (.listTransformJobsAsync request))))

(defn stop-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.StopNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.StopNotebookInstanceRequest request]
    (-> this (.stopNotebookInstanceAsync request))))

(defn list-code-repositories-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCodeRepositories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListCodeRepositoriesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCodeRepositoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListCodeRepositoriesRequest request]
    (-> this (.listCodeRepositoriesAsync request))))

(defn create-model-package-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.CreateModelPackageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateModelPackage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.CreateModelPackageResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createModelPackageAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.CreateModelPackageRequest request]
    (-> this (.createModelPackageAsync request))))

(defn delete-notebook-instance-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotebookInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotebookInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DeleteNotebookInstanceRequest request]
    (-> this (.deleteNotebookInstanceAsync request))))

(defn list-model-packages-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListModelPackagesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListModelPackages operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListModelPackagesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listModelPackagesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListModelPackagesRequest request]
    (-> this (.listModelPackagesAsync request))))

(defn add-tags-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.AddTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.AddTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.AddTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.AddTagsRequest request]
    (-> this (.addTagsAsync request))))

(defn list-notebook-instances-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListNotebookInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.ListNotebookInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listNotebookInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.ListNotebookInstancesRequest request]
    (-> this (.listNotebookInstancesAsync request))))

(defn describe-workteam-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeWorkteam operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.DescribeWorkteamResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeWorkteamAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.DescribeWorkteamRequest request]
    (-> this (.describeWorkteamAsync request))))

(defn update-endpoint-async
  "Description copied from interface: AmazonSageMakerAsync

  request - `com.amazonaws.services.sagemaker.model.UpdateEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sagemaker.model.UpdateEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSageMakerAsyncClient this ^com.amazonaws.services.sagemaker.model.UpdateEndpointRequest request]
    (-> this (.updateEndpointAsync request))))


(ns vermillion.env
  (:require
    [selmer.parser :as parser]
    [clojure.tools.logging :as log]
    [vermillion.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[vermillion started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[vermillion has shut down successfully]=-"))
   :middleware wrap-dev})

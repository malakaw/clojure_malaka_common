(ns kit.test
  (:gen-class)
  (:use org.httpkit.server)
  )

(def const-str (apply str (repeat 1 "http-kit is a http server & client
   written from scrach for high performance clojure web applications,
   support async and websocket")))

(defn handler [req]
  (let [length 10]
    {:status 200
     :headers {"Content-Type" "text/plain"}
     :body (subs const-str 0 (max (min 10240 length) 1))}))

(defn -main [& args]
  (run-server (-> handler)
              {:port 8000})
  (println (str "Server started. listen at 0.0.0.0@8000")))
